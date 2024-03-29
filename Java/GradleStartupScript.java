import java.io.File;
import java.io.IOException;

public class GradleStartupScript {
    public static void main(String[] args) {
        // Attempt to set APP_HOME
        String prg = GradleStartupScript.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        File prgFile = new File(prg);
        String appHome;
        try {
            appHome = prgFile.getCanonicalFile().getParent();
        } catch (IOException e) {
            appHome = prgFile.getParent();
        }
        
        String appName = "Gradle";
        String appBaseName = prgFile.getName();
        
        // Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
        String defaultJvmOpts = "";
        
        // Use the maximum available, or set MAX_FD != -1 to use that value.
        String maxFd = "maximum";
        
        // OS specific support (must be 'true' or 'false').
        boolean cygwin = false;
        boolean darwin = false;
        boolean nonstop = false;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            cygwin = true;
        } else if (osName.contains("mac")) {
            darwin = true;
        } else if (osName.contains("openvms")) {
            nonstop = true;
        }
        
        String classPath = appHome + "/gradle/wrapper/gradle-wrapper.jar";
        String javaHome = System.getProperty("java.home");
        String javaCmd;
        if (javaHome != null) {
            javaCmd = javaHome + "/bin/java";
        } else {
            javaCmd = "java";
        }
        
        // Escape application args
        StringBuilder appArgsBuilder = new StringBuilder();
        for (String arg : args) {
            appArgsBuilder.append("'").append(arg.replace("'", "'\\''")).append("' ");
        }
        String appArgs = appArgsBuilder.toString().trim();
        
        // Collect all arguments for the java command
        String[] javaCmdArgs = new String[] {
            javaCmd,
            defaultJvmOpts,
            "-classpath",
            classPath,
            "org.gradle.wrapper.GradleWrapperMain",
            appArgs
        };
        
        // Execute the Java command
        try {
            new ProcessBuilder(javaCmdArgs).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Optionally, you may also handle additional logic for Darwin and Cygwin environments
    }
}
