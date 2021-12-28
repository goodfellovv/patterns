public class Main {
    public static void main(String[] args) {
        UploadFacade facade = new UploadFacade();
        System.out.println("<<<<<<<<<<<<<<<<<<<Xml string save as file with verification>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        facade.uploadStringAsFile("<attr>Data</attr>", "xml", true);
        System.out.println("<<<<<<<<<<<<<<<<<END>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("<<<<<<<<<<<<<<<<<Xml string save as file without verification>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        facade.uploadStringAsFile("<attr>Data</attr>", "xml", false);
        System.out.println("<<<<<<<<<<<<<<<<<END>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("<<<<<<<<<<<<<<<<<Json string save as file with verification>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        facade.uploadStringAsFile("{attr: 'Data'}", "json", true);
        System.out.println("<<<<<<<<<<<<<<<<<END>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("<<<<<<<<<<<<<<<<<Json string save as file without verification>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        facade.uploadStringAsFile("{attr: 'Data'}", "json", false);
        System.out.println("<<<<<<<<<<<<<<<<<END>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
    }
}
