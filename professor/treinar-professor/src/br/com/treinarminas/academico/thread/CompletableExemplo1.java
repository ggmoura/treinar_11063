package br.com.treinarminas.academico.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableExemplo1 {
     
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> c1 = new CompletableFuture<>();
        c1.complete("Ola Mundo");
        c1.thenAccept(str -> System.out.println(str));
        Thread.sleep(1000);
    }
}