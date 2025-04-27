package com.example.ditt_template;

import java.util.Map;
import org.pf4j.Extension;
import org.springframework.stereotype.Service;
import com.example.ditt_sdk.Service.DevToolExtensionPoint;
import com.example.ditt_sdk.Service.DevToolInterface;

@Extension
@Service
public class YourService implements DevToolInterface<YourRequest, Map<String, String>>, DevToolExtensionPoint {

    // Initialize any required fields

    @Override
    public String getName() {
        // TODO: Return the name of the service/tool
        return null;
    }

    @Override
    public String getCategory() {
        // TODO: Return the category this service belongs to
        return null;
    }

    @Override
    public Map<String, String> execute(YourRequest input) {
        // TODO: Implement the main execution logic and return a Map<String, String>
        return Map.of(); // Example: Map.of("key", "value");
    }

    // Optional: Add helper methods if needed
}
