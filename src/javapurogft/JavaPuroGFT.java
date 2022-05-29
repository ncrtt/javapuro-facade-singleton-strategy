/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapurogft;

import javapurogft.singleton.SingletonEager;
import javapurogft.singleton.SingletonLazy;
import javapurogft.singleton.SingletonLazyHolder;
import javapurogft.strategy.Comportamento;
import javapurogft.strategy.ComportamentoAgressivo;
import javapurogft.strategy.ComportamentoDefensivo;
import javapurogft.strategy.ComportamentoNormal;
import javapurogft.strategy.Robo;
import javapurogft.facade.Facade;

/**
 *
 * @author felip
 */
public class JavaPuroGFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Felipe", "85976000");
    }

}
