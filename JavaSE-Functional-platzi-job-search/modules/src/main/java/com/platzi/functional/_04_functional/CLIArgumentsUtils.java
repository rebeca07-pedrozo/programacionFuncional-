package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> cosumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual ha sido solicitado");
            }
        };
        cosumerHelper.accept(cliArguments);
    }
    static CLIArguments generateCLIA(){
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();

    }
}
