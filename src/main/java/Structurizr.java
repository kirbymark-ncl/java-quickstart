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

/**
 * This is a simple example of how to get started with Structurizr for Java.
 */
public class Structurizr {

    private static final long WORKSPACE_ID = 60892;
    private static final String API_KEY = "f3c621ea-9c22-44bb-aef0-bedad45cc994";
    private static final String API_SECRET = "8190760c-c480-4624-bcf6-dfdd3c046288";

    public static void main(String[] args) throws Exception {
        // a Structurizr workspace is the wrapper for a software architecture model, views and documentation
        StructurizrClient structurizrClient = new StructurizrClient(API_KEY, API_SECRET);
        WorkspaceUtils.saveWorkspaceToJson(structurizrClient.getWorkspace(WORKSPACE_ID), new File("workspace.json"));

    }
}
