package ai.pdfparser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.text.PDFTextStripper;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        App myPDFReader = new App();
        myPDFReader.outputFiguresFromPDF("C:\\Users\\jhe\\OneDrive - IAS-USA\\_Programming Projects\\my_pdfparser\\FULL Figure and Table Backup-9-28-2023.pdf",
                                        new String[]{"Abstract Submission Number 144",
                                        "Abstract Submission Number 166",
                                        "Abstract Submission Number 167",
                                        "Abstract Submission Number 198",
                                        "Abstract Submission Number 281",
                                        "Abstract Submission Number 293",
                                        "Abstract Submission Number 312",
                                        "Abstract Submission Number 315",
                                        "Abstract Submission Number 387",
                                        "Abstract Submission Number 390",
                                        "Abstract Submission Number 392",
                                        "Abstract Submission Number 393",
                                        "Abstract Submission Number 421",
                                        "Abstract Submission Number 451",
                                        "Abstract Submission Number 468",
                                        "Abstract Submission Number 502",
                                        "Abstract Submission Number 558",
                                        "Abstract Submission Number 689",
                                        "Abstract Submission Number 709",
                                        "Abstract Submission Number 723",
                                        "Abstract Submission Number 724",
                                        "Abstract Submission Number 726",
                                        "Abstract Submission Number 731",
                                        "Abstract Submission Number 746",
                                        "Abstract Submission Number 784",
                                        "Abstract Submission Number 786",
                                        "Abstract Submission Number 837",
                                        "Abstract Submission Number 839",
                                        "Abstract Submission Number 879",
                                        "Abstract Submission Number 905",
                                        "Abstract Submission Number 915",
                                        "Abstract Submission Number 924",
                                        "Abstract Submission Number 925",
                                        "Abstract Submission Number 927",
                                        "Abstract Submission Number 950",
                                        "Abstract Submission Number 984",
                                        "Abstract Submission Number 1005",
                                        "Abstract Submission Number 1033",
                                        "Abstract Submission Number 1048",
                                        "Abstract Submission Number 1074",
                                        "Abstract Submission Number 1105",
                                        "Abstract Submission Number 1132",
                                        "Abstract Submission Number 1149",
                                        "Abstract Submission Number 1200",
                                        "Abstract Submission Number 1209",
                                        "Abstract Submission Number 1220",
                                        "Abstract Submission Number 1228",
                                        "Abstract Submission Number 1230",
                                        "Abstract Submission Number 1241",
                                        "Abstract Submission Number 1251",
                                        "Abstract Submission Number 1270",
                                        "Abstract Submission Number 1291",
                                        "Abstract Submission Number 1293",
                                        "Abstract Submission Number 1312",
                                        "Abstract Submission Number 1313",
                                        "Abstract Submission Number 1325",
                                        "Abstract Submission Number 1346",
                                        "Abstract Submission Number 1353",
                                        "Abstract Submission Number 1371",
                                        "Abstract Submission Number 1397",
                                        "Abstract Submission Number 1413",
                                        "Abstract Submission Number 1418",
                                        "Abstract Submission Number 1436",
                                        "Abstract Submission Number 1451",
                                        "Abstract Submission Number 1452",
                                        "Abstract Submission Number 1477",
                                        "Abstract Submission Number 1480",
                                        "Abstract Submission Number 1487",
                                        "Abstract Submission Number 1492",
                                        "Abstract Submission Number 1501",
                                        "Abstract Submission Number 1503",
                                        "Abstract Submission Number 1515",
                                        "Abstract Submission Number 1537",
                                        "Abstract Submission Number 1596",
                                        "Abstract Submission Number 1616",
                                        "Abstract Submission Number 1638",
                                        "Abstract Submission Number 1643",
                                        "Abstract Submission Number 1665",
                                        "Abstract Submission Number 1670",
                                        "Abstract Submission Number 1677",
                                        "Abstract Submission Number 1709",
                                        "Abstract Submission Number 1712",
                                        "Abstract Submission Number 1730",
                                        "Abstract Submission Number 1735",
                                        "Abstract Submission Number 1751",
                                        "Abstract Submission Number 1754",
                                        "Abstract Submission Number 1755",
                                        "Abstract Submission Number 1758",
                                        "Abstract Submission Number 1782",
                                        "Abstract Submission Number 1792",
                                        "Abstract Submission Number 1800",
                                        "Abstract Submission Number 1824",
                                        "Abstract Submission Number 1847",
                                        "Abstract Submission Number 1867",
                                        "Abstract Submission Number 1912",
                                        "Abstract Submission Number 1915",
                                        "Abstract Submission Number 1971",
                                        "Abstract Submission Number 1973",
                                        "Abstract Submission Number 1982",
                                        "Abstract Submission Number 2053",
                                        "Abstract Submission Number 2060",
                                        "Abstract Submission Number 2066",
                                        "Abstract Submission Number 2072",
                                        "Abstract Submission Number 2087",
                                        "Abstract Submission Number 2090",
                                        "Abstract Submission Number 2143",
                                        "Abstract Submission Number 2164",
                                        "Abstract Submission Number 2185",
                                        "Abstract Submission Number 2189",
                                        "Abstract Submission Number 2233",
                                        "Abstract Submission Number 2244",
                                        "Abstract Submission Number 2247",
                                        "Abstract Submission Number 2251",
                                        "Abstract Submission Number 2281",
                                        "Abstract Submission Number 2302",
                                        "Abstract Submission Number 2318",
                                        "Abstract Submission Number 2345",
                                        "Abstract Submission Number 2366",
                                        "Abstract Submission Number 2376",
                                        "Abstract Submission Number 2433",
                                        "Abstract Submission Number 2447",
                                        "Abstract Submission Number 2474",
                                        "Abstract Submission Number 2477",
                                        "Abstract Submission Number 2538",
                                        "Abstract Submission Number 2569",
                                        "Abstract Submission Number 2587",
                                        "Abstract Submission Number 2612",
                                        "Abstract Submission Number 2625",
                                        "Abstract Submission Number 2644",
                                        "Abstract Submission Number 2656",
                                        "Abstract Submission Number 2677",
                                        "Abstract Submission Number 2707",
                                        "Abstract Submission Number 2719",
                                        "Abstract Submission Number 2760",
                                        "Abstract Submission Number 2764",
                                        "Abstract Submission Number 2765",
                                        "Abstract Submission Number 2767",
                                        "Abstract Submission Number 2785",
                                        "Abstract Submission Number 2790",
                                        "Abstract Submission Number 2802",
                                        "Abstract Submission Number 2805",
                                        "Abstract Submission Number 2811",
                                        "Abstract Submission Number 2824",
                                        "Abstract Submission Number 2829",
                                        "Abstract Submission Number 2875",
                                        "Abstract Submission Number 2907",
                                        "Abstract Submission Number 2923",
                                        "Abstract Submission Number 2933",
                                        "Abstract Submission Number 2934",
                                        "Abstract Submission Number 2946",
                                        "Abstract Submission Number 2982",
                                        "Abstract Submission Number 3030",
                                        "Abstract Submission Number 3040",
                                        "Abstract Submission Number 3044",
                                        "Abstract Submission Number 3051",
                                        "Abstract Submission Number 3053",
                                        "Abstract Submission Number 3056",
                                        "Abstract Submission Number 3080",
                                        "Abstract Submission Number 3084",
                                        "Abstract Submission Number 3088",
                                        "Abstract Submission Number 3093",
                                        "Abstract Submission Number 3120",
                                        "Abstract Submission Number 3124",
                                        "Abstract Submission Number 3127",
                                        "Abstract Submission Number 3137",
                                        "Abstract Submission Number 3144",
                                        "Abstract Submission Number 3162",
                                        "Abstract Submission Number 3164",
                                        "Abstract Submission Number 3168",
                                        "Abstract Submission Number 3181",
                                        "Abstract Submission Number 3188",
                                        "Abstract Submission Number 3211",
                                        "Abstract Submission Number 3215",
                                        "Abstract Submission Number 3216",
                                        "Abstract Submission Number 3226",
                                        }, "C:\\Users\\jhe\\OneDrive - IAS-USA\\_Programming Projects\\my_pdfparser\\_ExtractedFigures");
    }

    public void outputFiguresFromPDF(String pdfFilePath, String[] abstractNumberTargets, String depositFolderPath) throws IOException {
        PDDocument document = null;
        try {
            document = Loader.loadPDF(new File(pdfFilePath));
            Map<String, Integer> mapTargetsToPageNumber = getMapAbstractNumberToPageNumber(document, abstractNumberTargets);
            for (Map.Entry<String,Integer> entry : mapTargetsToPageNumber.entrySet()) {
                BufferedImage figure = getImageOnAfterPage(document, entry.getValue());
                if (figure != null) {
                    File outputFile = new File(depositFolderPath + "\\" + entry.getKey().replace("AbstractSubmissionNumber", "") + ".png");
                    ImageIO.write(figure, "png", outputFile);
                } else {
                    System.out.println("Error: " + entry.getKey() + " - could not find figure");
                }
            }
        } finally {
            if (document != null) {
                document.close();
            }
        }
    }

    private Map<String, Integer> getMapAbstractNumberToPageNumber(PDDocument document, String[] abstractNumberTargets) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        List<String> cleanedAbstractNumberTargets = getCleanedAbstractNumberTargets(abstractNumberTargets);
        for (int i = 0; i < document.getNumberOfPages(); i++) {
            String pageText = getPageText(document, i+1);
            int indexFoundInTargets = pageContainsAbstractNumber(pageText, cleanedAbstractNumberTargets);
            if (indexFoundInTargets > -1) map.put(cleanedAbstractNumberTargets.get(indexFoundInTargets), i);
        }
        return map;
    }

    /**
     * Cleaned meaning each target string has their spaces removed so the check later has no need to worry
     * about newlines and end whitespaces.
     * @param abstractNumberTargets
     * @return
     */
    private List<String> getCleanedAbstractNumberTargets(String[] abstractNumberTargets) {
        List<String> cleaned = new ArrayList<>();
        for (int i = 0; i < abstractNumberTargets.length; i++) {
            cleaned.add(abstractNumberTargets[i].replace(" ", "").trim());
        }
        return cleaned;
    }

    //Tested - Works!
    private BufferedImage getImageOnAfterPage(PDDocument document, int page) {
        BufferedImage buffImage = null;
        PDPageTree pageTree = document.getPages();

        for (int i = page; i < document.getNumberOfPages(); i++) {
            PDPage curPage = pageTree.get(i);
            PDResources curPageResources = curPage.getResources();
            for (COSName cosName : curPageResources.getXObjectNames()) {
                try {
                    PDXObject xObject = curPageResources.getXObject(cosName);
                    if (xObject instanceof PDImageXObject) {
                        PDImageXObject pdImage = (PDImageXObject) xObject;
                        buffImage = pdImage.getImage();
                        break;
                    }
                } catch (IOException ex) {

                }
            }
            if (buffImage != null) break;
        }

        return buffImage;
    }

    //Tested - Works
    private String getPageText(PDDocument document, int page) throws IOException {
        PDFTextStripper textStripper = new PDFTextStripper();
        textStripper.setStartPage(page);
        textStripper.setEndPage(page);
        textStripper.setSortByPosition(true);
        String pageText = textStripper.getText(document);
        return pageText;
    }

    //Tested - Works
    private int pageContainsAbstractNumber(String pageText, List<String> targetAbstractNumbers) {
        String[] splitted = pageText.split("\n");
        for (int i = 0; i < splitted.length; i++) {
            String curText = splitted[i].replace(" ", "").trim();
            // String targetTextTrim = targetAbstractNumbers.replace(" ", "").trim();
            int curTextHasTarget = targetAbstractNumbers.indexOf(curText);
            if (curTextHasTarget > -1) {
                return curTextHasTarget;
            }
        }
        return -1;
    }
}
