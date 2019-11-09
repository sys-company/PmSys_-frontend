/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pmsys.oshi;

/**
 *
 * @author Ultim
 */


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class OshiDados implements Job{


    public void execute(JobExecutionContext args0) throws JobExecutionException {

    

        DadosCPU dCpu = new DadosCPU(1002);
        DadosRAM dRam = new DadosRAM(1002);
        DadosHD dHd = new DadosHD(1002);
        DadosProcessos dProcessos = new DadosProcessos(1002);
        
        try{
        System.out.println("Inserindo dados de CPU...");
        dCpu.insereDadosCPU();
        System.out.println("Inserindo dados de RAM...");
        dRam.insereDadosRam();
        System.out.println("Inserindo dadosde HD...");
        dHd.insereDadosHD();
        System.out.println("Enviando processos...");
        dProcessos.processosAtuais();
        }catch(Exception e){
            System.err.print("Erro ao inserir dados : " +e);
        }
        
        System.out.println("Dados Inseridos");

    }
    //Pega informações gerais do hardware do PC





}
        
        
