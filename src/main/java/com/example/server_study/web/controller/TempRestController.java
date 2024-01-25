//package com.example.server_study.web.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import  com.example.server_study.apiPayload.ApiResponse;
//import  com.example.server_study.converter.TempConverter;
//import  com.example.server_study.service.TempService.TempQueryService;
//import  com.example.server_study.web.dto.TempResponse;
//
//@RestController
//@RequestMapping("/temp")
//@RequiredArgsConstructor
//public class TempRestController {
//
//
//    private final TempQueryService tempQueryService;
//
//    @GetMapping("/test")
//    public ApiResponse<TempResponse.TempTestDTO> testAPI(){
//
//        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
//    }
//
//    @GetMapping("/exception")
//    public ApiResponse<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
//        tempQueryService.CheckFlag(flag);
//        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));
//    }
//}
