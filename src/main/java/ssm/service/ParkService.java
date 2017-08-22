package ssm.service;

import org.springframework.ui.Model;
import ssm.model.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ParkService {
    Page getParkPage(HttpServletRequest request, Model model);
    void getParkById(HttpServletRequest request,Model model);
    List<Building> getBuildingListByParkId(HttpServletRequest request,Model model);
    void newBuilding(Building building);
    List<Room> getRoomsByBuildingId(HttpServletRequest request,Model model);
    void newRoom(Room room);

}
