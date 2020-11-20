import com.structurizr.Workspace;
import com.structurizr.api.StructurizrClient;
import com.structurizr.documentation.Format;
import com.structurizr.documentation.StructurizrDocumentationTemplate;
import com.structurizr.model.Model;
import com.structurizr.model.Person;
import com.structurizr.model.SoftwareSystem;
import com.structurizr.model.Tags;
import com.structurizr.util.WorkspaceUtils;
import com.structurizr.view.*;
import java.io.*;


public class ExportWorkspace {

    private static final long WORKSPACE_ID = 36141;
    private static final String API_KEY = "key";
    private static final String API_SECRET = "secret";

    public static void main(String[] args) throws Exception {
        StructurizrClient structurizrClient = new StructurizrClient(API_KEY, API_SECRET);
        WorkspaceUtils.saveWorkspaceToJson(structurizrClient.getWorkspace(WORKSPACE_ID), new File("workspace.json"));
    }

}