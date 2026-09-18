package five.min.markets.json;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;
import org.junit.jupiter.api.Test;
import com.sun.codemodel.JCodeModel;

public class GeneratePojosFromJsonSchema {

	private void generate(URL source) throws IOException {
		JCodeModel codeModel = new JCodeModel();
		GenerationConfig config = new DefaultGenerationConfig() {
		@Override
		public boolean isGenerateBuilders() { // set config option by overriding method
		return true;
		}
		};

		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, "PolyMarket", "five.min.markets.poly.model", source);

		codeModel.build(Files.createDirectories(Path.of("json")).toFile());
	}
	
	@Test
	public void polyMarketModel() throws IOException {
		generate(URI.create("https://gamma-api.polymarket.com/schemas/Market.json").toURL());
	}
}
