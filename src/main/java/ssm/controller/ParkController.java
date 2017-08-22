package ssm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.model.Building;
import ssm.model.Page;
import ssm.model.Park;
import ssm.model.Room;
import ssm.service.ParkService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/park")
public class ParkController {
    @Resource
    private ParkService parkService;
    @RequestMapping("/parklist")
    public String parkList(HttpServletRequest request, Model model){


        return "park";
    }
    @RequestMapping("/parkinf")
    public String parkInf(HttpServletRequest request,Model model){
        System.out.println(request.getParameter("id"));
        this.parkService.getParkById(request,model);

        return "park-parkinf";
    }
    @RequestMapping("/ajaxParkList")
    @ResponseBody
    public String ajaxParkList(HttpServletRequest request,Model model){
        Page page = this.parkService.getParkPage(request,model);
        String str = JSON.toJSONString(page);
        System.out.println(str);
        return str;
    }
    @RequestMapping("/ajaxGetBuildingList")
    @ResponseBody
    public  String ajaxGetBuildingList(HttpServletRequest request,Model model){
        List<Building> buildingList= this.parkService.getBuildingListByParkId(request,model);
        String str =JSON.toJSONString(buildingList);
        return str;
    }
    @RequestMapping("/ajaxNewbuilding")
    @ResponseBody
    public JSONObject newBuilding(HttpServletRequest request, Model model, Building building){

        JSONObject jsonObject = new JSONObject();

        this.parkService.newBuilding(building);
        return jsonObject;
    }
    @RequestMapping("/ajaxGetRooms")
    @ResponseBody
    public String getRooms(HttpServletRequest request,Model model){
        System.out.println(request.getParameter("id"));
        List<Room> roomList=this.parkService.getRoomsByBuildingId(request,model);
        String str=JSON.toJSONString(roomList);
        System.out.println(str);
        return str;
    }
    @RequestMapping("/ajaxNewRoom")
    @ResponseBody
    public String newRoom(HttpServletRequest request,Model model,Room room){

        this.parkService.newRoom(room);
        return "success";
    }

}
