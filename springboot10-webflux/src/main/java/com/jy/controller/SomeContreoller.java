package com.jy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class SomeContreoller {
    @GetMapping("/momo")
    public Mono<String> getMomo(){
        //return Mono.just("mono return");
        //Mono<String> mono =Mono.fromSupplier(()->doSome("mono,handler"));
        //return mono;
        return null;
    }

    private String doSome(String s) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * Flux包含0个或者N个元素的异步序列。
     * @return
     */
    @RequestMapping("/flux")
    public Flux<String> fluxHandle(){
        return Flux.just("bj","sh","gz");
    }
    /**
     * 将数组转化为Flux
     * @param cities
     * @return
     */
    @RequestMapping("/array")
    public Flux<String> fluxHandleArray(@RequestParam String[] cities){
        return Flux.fromArray(cities);
    }

    /**
     * 将list转化为Stream，再将Stream转化为Flux。
     * @param cities
     * @return
     */
    @RequestMapping("/list")
    public Flux<String> fluxHandle(@RequestParam List<String> cities){
        return Flux.fromStream(cities.stream());
    }
    //localhost:8080/time?cities=bj&cities=sh&cities=gz
    @RequestMapping("/time")
    public Flux<String> timeFluxHandle(@RequestParam List<String> cities){
        //Flux<String> flux = Flux.fromStream(cities.stream().map(i->doSome("elem-"+i)));
        return null;
    }
}
