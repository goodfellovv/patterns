package verifiers;

import files.File;

public class XmlVerifier implements Verifier {
    @Override
    public boolean isValid(File file) {
        System.out.println("Verify XML file");
        return file.getData().startsWith("<");
    }
}
