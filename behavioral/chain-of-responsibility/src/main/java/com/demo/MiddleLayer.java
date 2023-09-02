package com.demo;
/*
structural programming
object-oriented
functional
reactive
 */
public class MiddleLayer implements IHelp{

    private IHelp iHelp;

    private static final int HELP_CONTENT = 2;

    public MiddleLayer(IHelp iHelp) {
        this.iHelp = iHelp;
    }

    @Override
    public void help(int num) {
        if(num == HELP_CONTENT){
            System.out.println("MiddleLayer ...");
        }
        else {
            iHelp.help(num);
        }
    }
}
