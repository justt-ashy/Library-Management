package com.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HomeService {
    public Map<String, Long> getTopTilesMap() {
        Map<String, Long> map = new HashMap<>();

        // Temporary values (replace with real service calls later)
        map.put("totalCategories", 5L);
        map.put("totalBooks", 10L);

        return map;
    }
}
