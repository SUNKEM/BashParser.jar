package BashParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BashParser {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
\u001B[0m
######################################################################################
\u001B[35m
██████╗ ██╗   ██╗     ██████╗ ███████╗██╗   ██╗███╗   ██╗██╗  ██╗███████╗███╗   ███╗
██╔══██╗╚██╗ ██╔╝    ██╔═══██╗██╔════╝██║   ██║████╗  ██║██║ ██╔╝██╔════╝████╗ ████║
██████╔╝ ╚████╔╝     ██║██╗██║███████╗██║   ██║██╔██╗ ██║█████╔╝ █████╗  ██╔████╔██║
██╔══██╗  ╚██╔╝      ██║██║██║╚════██║██║   ██║██║╚██╗██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║
██████╔╝   ██║       ╚█║████╔╝███████║╚██████╔╝██║ ╚████║██║  ██╗███████╗██║ ╚═╝ ██║
╚═════╝    ╚═╝        ╚╝╚═══╝ ╚══════╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝
\u001B[0m
######################################################################################
                                                                                    
GitHub repo:   https://github.com/SUNKEM/BashParser.jar                                                               
                """);
        System.out.println("\u001B[32m" + "Shell ready. Type commands ('exit' or 'stop' to quit):" + "\u001B[0m");

        while (true) {
            System.out.print("\n\u001B[36m"+"parser@sunkem_1 ~> "+"\u001B[0m");
            String cmd = reader.readLine();
            if (cmd == null || cmd.trim().equals("exit") || cmd.trim().equals("stop")) break;

            Process process = new ProcessBuilder("bash", "-c", cmd)
                    .redirectErrorStream(true)
                    .start();

            BufferedReader output = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = output.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        }
        System.out.println("GG, BB!");
    }
}
