package com.demo;

public class FrontEndLayer implements IHelp{

    private static final int HELP_CONTENT = 1;

    private IHelp iHelp;

    public FrontEndLayer(IHelp iHelp) {
        this.iHelp = iHelp;
    }

    @Override
    public void help(int num) {
        if(num==HELP_CONTENT){
            System.out.println("FrontEndLayer...");
        }
        else {
            iHelp.help(num);
        }
    }
}
