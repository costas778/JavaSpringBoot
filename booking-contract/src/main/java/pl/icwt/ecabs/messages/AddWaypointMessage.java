package pl.icwt.ecabs.messages;

import lombok.Data;
import pl.icwt.ecabs.dtos.TripWaypointDTO;

import java.util.UUID;

@Data
public class AddWaypointMessage {
    private UUID bookingId;
    private TripWaypointDTO waypoint;
}
