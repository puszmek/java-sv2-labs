package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom: meetingRooms) {
            System.out.println(meetingRoom.getName());
        }

    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom meetingRoom: meetingRooms) {
            printDetailsOfMeetingRoom(meetingRoom);
            System.out.println();
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                System.out.printf("Tárgyaló szélessége: %d m, hosszúsága: %d m, területe: %d m2.",
                        meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
                System.out.println();
            }
        }
    }

    private void printDetailsOfMeetingRoom(MeetingRoom meetingRoom) {
        System.out.printf("Tárgyaló neve: %s, szélessége: %d m, hosszúsága: %d m, területe: %d m2.",
                meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.printf("Tárgyaló szélessége: %d m, hosszúsága: %d m, területe: %d m2.",
                        meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
                System.out.println();
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getArea() > area) {
                printDetailsOfMeetingRoom(meetingRoom);
                System.out.println();
            }
        }
    }
}
