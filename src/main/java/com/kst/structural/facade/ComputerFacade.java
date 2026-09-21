package com.kst.structural.facade;

public class ComputerFacade
{
    private final CPU cpu = new CPU();
    private final RAM ram = new RAM();
    private final OS os = new OS();

    void start()
    {
        this.cpu.start();
        this.os.start();
        this.ram.start();
    }
}
