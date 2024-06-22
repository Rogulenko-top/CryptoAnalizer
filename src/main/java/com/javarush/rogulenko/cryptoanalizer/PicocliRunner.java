package com.javarush.rogulenko.cryptoanalizer;
import com.javarush.rogulenko.cryptoanalizer.entity.Result;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.Spec;
import java.util.Locale;
import java.io.File;

@Command(name = "cypher", subcommands = {CommandLine.HelpCommand.class }, description = "Caesar cypher command")

    public class PicocliRunner implements Runnable {

    private final Application application = new Application();
    @Spec CommandSpec spec;
    @Command(name = "decode", description = "Encrypt from file to file using key")
            void encrypt(
            @Parameters(paramLabel = "<source file>", description = "source file with encrypted text") String src,
            @Parameters(paramLabel = "<dest file>", description = "dest file which should have decrypted text") String dest,
            @Parameters(paramLabel = "<key>", description = "dest file which should have decrypted text") String key) {
        String[] args = {"decode", src, dest, key};
        Result result = application.run(args);
        System.out.println(result);
    }

    @Command(name = "brudeforce", description = "Decrypt from file to file using brute force") // |3|
            void bruteForce(
            @Parameters(paramLabel = "<source file>", description = "source file with encrypted text") String src,
            @Parameters(paramLabel = "<dest file>", description = "dest file which should have decrypted text") String dest,
            @Parameters(paramLabel = "<key>", description = "dest file which should have decrypted text") String key) {
        String[] args = {"brudeforce", src, dest, key};
        Result result = application.run(args);
        System.out.println(result);
    }


    @Command(name = "encode", description = "Decrypt from file to file using statistical analysis") // |3|
            void decrypt(
            @Parameters(paramLabel = "<source file>", description = "source file with encrypted text") String src,
            @Parameters(paramLabel = "<dest file>", description = "dest file which should have decrypted text") String dest,
            @Parameters(paramLabel = "<key>", description = "key for encryption") String key) {
        String[] args = {"encode", src, dest, key};
        Result result = application.run(args);
        System.out.println(result);
    }

    @Override
    public void run() {
        throw new ParameterException(spec.commandLine(), "Specify a subcommand");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new PicocliRunner()).execute(args); System.exit(exitCode);
    }
}

