package oopj.java;
class Multithreading extends Thread{
    public void run(){
        System.out.println("Thread is running");}}
public class TestMultithreading{
    public static void main(String[]args){
        Multithreading mt1=new Multithreading();
        mt1.start();}}
