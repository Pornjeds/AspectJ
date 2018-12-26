package com.pornjeds.annotation;

public class PSClass {
    public static void main(String[] args) {
        PSClass yourClass = new PSClass();
        yourClass.yourMethodAroundDontRun();
        yourClass.yourMethodAroundRunTrue();
        yourClass.yourMethodAroundRun();
    }

    @PSAnnotation(isRun = false)
    public void yourMethodAroundDontRun() {
        System.out.println("Executing TestTarget.yourMethodAroundDontRun()");
    }

    @PSAnnotation(isRun = true)
    public void yourMethodAroundRunTrue() {
        System.out.println("Executing TestTarget.yourMethodAroundRunTrue()");
    }

    @PSAnnotation()
    public void yourMethodAroundRun() {
        System.out.println("Executing TestTarget.yourMethodAroundRun()");
    }
}
