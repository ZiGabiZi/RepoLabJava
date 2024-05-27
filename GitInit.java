package task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GitInit {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java GitInit <directory>");
            System.exit(1);
        }

        String directoryPath = args[0];
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The provided path is not a valid directory.");
            System.exit(1);
        }

        File gitDir = new File(directory, ".git");
        File objectsDir = new File(gitDir, "objects");
        File refsDir = new File(gitDir, "refs");
        File headFile = new File(gitDir, "HEAD");

        try {
            createDirectory(gitDir);
            createDirectory(objectsDir);
            createDirectory(refsDir);
            createHeadFile(headFile);
            System.out.println("Initialized empty Git repository in " + gitDir.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("An error occurred while initializing the Git repository: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void createDirectory(File dir) throws IOException {
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                throw new IOException("Failed to create directory: " + dir.getAbsolutePath());
            }
        }
    }

    private static void createHeadFile(File headFile) throws IOException {
        try (FileWriter writer = new FileWriter(headFile)) {
            writer.write("ref: refs/heads/main\n");
        }
    }
}
