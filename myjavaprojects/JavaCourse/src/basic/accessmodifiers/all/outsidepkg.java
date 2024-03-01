package basic.accessmodifiers.all;

import basic.accessmodifiers.pkgs.accessmodify;

public class outsidepkg {
    
    public static void main(String[] args) {
        
        accessmodify b = new accessmodify();

        b.met();
    }
}
