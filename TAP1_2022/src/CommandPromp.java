/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class CommandPromp {
    public static void main (String []args){
    if(args.length<2){System.out.print("Faltan parametros");return;}
    for(int i=0; i<2; i++){
    System.out.print(args[i]);
    }
}}