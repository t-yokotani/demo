package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TestResponseList {
    private List<TestResponse> list = new ArrayList<>();
}
