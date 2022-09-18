/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.pashockerr.telemetry.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author userpc
 */
@Component
public class ValuesComponent {
    //<editor-fold desc="Private values">
    private float voltageBattery;
    private float voltageHydrogen1;
    private float voltageHydrogen2;

    private float currentBattery;
    private float currentHydrogen1;
    private float currentHydrogen2;
    //</editor-fold>

    //<editor-fold desc="Getters">
    public float getVoltageBattery() {
        return voltageBattery;
    }

    public float getVoltageHydrogen1() {
        return voltageHydrogen1;
    }

    public float getVoltageHydrogen2(){
        return voltageHydrogen2;
    }
    
    public float getCurrentBattery(){
        return currentBattery;
    }
    
    public float getCurrentHydrogen1(){
        return currentHydrogen1;
    }
    
    public float getCurrentHydrogen2(){
        return currentHydrogen2;
    }
    //</editor-fold>
    
    //<editor-fold desc="Setters">
    public void setVoltageBattery(float voltage){
        voltageBattery = voltage;
    }
    
    public void setVoltageHydrogen1(float voltage){
        voltageHydrogen1 = voltage;
    }
    
    public void setVoltageHydrogen2(float voltage){
        voltageHydrogen2 = voltage;
    }
    
    public void setCurrentBattery(float current){
        currentBattery = current;
    }
    
    public void setCurrentHydrogen1(float current){
        currentHydrogen1 = current;
    }
    
    public void setCurrentHydrogen2(float current){
        currentHydrogen2 = current;
    }
    //</editor-fold>
}
