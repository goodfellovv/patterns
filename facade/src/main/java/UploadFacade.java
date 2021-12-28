import files.File;
import parsers.StringToJson;
import parsers.StringToXml;
import verifiers.JsonVerifier;
import verifiers.XmlVerifier;

public class UploadFacade {
    private FileManager fileManager = new FileManager();

    void uploadStringAsFile(String data, String format, boolean verify){
        File file;
        if(format.equalsIgnoreCase("XML")){
            StringToXml parser = new StringToXml();
            file = parser.parse(data);
            if(verify){
                XmlVerifier verifier = new XmlVerifier();
                verifier.isValid(file);
                if(!verifier.isValid(file)){
                    throw new IllegalArgumentException("Data is not applicable for XML");
                }
                System.out.println("Data valid for JSON");
            }
            System.out.println("Data converted and uploaded as XML file");
        } else if(format.equalsIgnoreCase("JSON")){
            StringToJson parser = new StringToJson();
            file = parser.parse(data);
            if(verify){
                JsonVerifier verifier = new JsonVerifier();
                if(!verifier.isValid(file)){
                    throw new IllegalArgumentException("Data is not applicable for JSON");
                }
                System.out.println("Data valid for JSON");
            }
            System.out.println("Data converted and uploaded as JSON file");
        } else {
            throw new IllegalArgumentException("File format not supported");
        }
        fileManager.saveFile(file);
    }
}
