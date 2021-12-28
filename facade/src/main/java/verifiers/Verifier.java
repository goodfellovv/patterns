package verifiers;

import files.File;

public interface Verifier {
    boolean isValid(File file);
}
