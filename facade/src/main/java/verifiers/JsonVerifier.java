package verifiers;

import files.File;

public class JsonVerifier implements Verifier {
    @Override
    public boolean isValid(File file) {
        System.out.println("Verify JSON file");
        return file.getData().startsWith("{");
    }
}
