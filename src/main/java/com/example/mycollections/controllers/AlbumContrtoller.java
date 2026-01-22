package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import com.example.mycollections.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumContrtoller {
    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("Thriller", 1982, "Michael Jackson", 9));
        add(new Album("Nevermind", 1991, "Nirvana", 13));
        add(new Album("Rumors", 1977, "Fleetwood Mac", 11));
    }};

}
