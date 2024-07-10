package pe.isil;

// import com.mongodb.ConnectionString;
// import com.mongodb.MongoClientSettings;
// import com.mongodb.MongoException;
// import com.mongodb.ServerApi;
// import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {

    public static void main(String[] args) {
        String connectionString = "mongodb+srv://brayanyl250206:MongoDBforIsil2024@mongocluster.56tcosv.mongodb.net/?retryWrites=true&w=majority&appName=MongoCluster";
        MongoClient client = MongoClients.create(connectionString);


        MongoDatabase database = client.getDatabase("demo");

        MongoCollection<Document> collection = database.getCollection("movies");

        Document document = new Document("title", "Inception")
            .append("director", "Christopher Nolan")
            .append("year", 2010);
    
        collection.insertOne(document);
        client.close();
    }
}

// SOLID
// S - SINGLE RESPONSABILITY
// O - OPEN/ CLOSE
// L - LISKOV SUSTITUTION
// I - 