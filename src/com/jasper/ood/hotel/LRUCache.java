package com.jasper.ood.hotel;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LRUCache extends LinkedHashMap<SearchRequest, Map<RoomType, List<Room>>> {

	private static final long serialVersionUID = 1L;
	private int capacity;

	public LRUCache(int capacity) {
		super(capacity);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Entry<SearchRequest, Map<RoomType, List<Room>>> eldest) {
		return size() > this.capacity;
	}

	private String printAvailableRooms(Map<RoomType, List<Room>> rooms) {
		String res = "";
		for (Entry<RoomType, List<Room>> entry : rooms.entrySet()) {
			res += "For room type: " + entry.getKey() + ", available rooms are: ";
			for (Room room : entry.getValue()) {
				res += room.getId() + "; ";
			}
			res += ". ";
		}
		return res;
	}

	@Override
	public String toString() {
		String res = "";

		for (Entry<SearchRequest, Map<RoomType, List<Room>>> entry : super.entrySet()) {
			res += ("Search Request -> " + entry.getKey().toString() + "\n");
			res += ("Value -> " + printAvailableRooms(entry.getValue()) + "\n");
			res += "\n";
		}

		return res;
	}
}
