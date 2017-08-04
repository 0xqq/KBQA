package com.qdcz.graph.neo4jcypher.buzi;

import com.qdcz.common.LoadConfigListener;
import com.qdcz.graph.entity.Edge;
import com.qdcz.graph.entity.Vertex;
import com.qdcz.graph.interfaces.IGraphBuzi;
import com.qdcz.graph.neo4jcypher.connect.Neo4jClientFactory;
import com.qdcz.graph.neo4jcypher.dao.Neo4jCYDAO;;
import org.json.JSONObject;

import org.neo4j.driver.v1.Driver;
import org.springframework.stereotype.Service;

/**
 * cypher语句，neo4j对外提供的操作
 * Created by star on 17-8-3.
 */
@Service("neo4jCypherBuzi")
public class Neo4jCYBuzi implements IGraphBuzi {

    public static void main(String[] args) {
        LoadConfigListener loadConfigListener=new LoadConfigListener();
        loadConfigListener.contextInitialized(null);

        Vertex vertex =  new Vertex();
        vertex.setType("");
        vertex.setLabel("ddd");
        vertex.setRelationship("gra");
        vertex.setRoot("root");
        vertex.setIdentity("gdflgjdfklj");
        vertex.setName("gfdfggf");




        Neo4jCYBuzi instance=  new Neo4jCYBuzi();
        instance.addVertex(vertex);
    }



    private Neo4jCYDAO neo4jCYDAO;

    private Driver driver;

    public Neo4jCYBuzi(){
        driver =  Neo4jClientFactory.create();
        neo4jCYDAO = new Neo4jCYDAO(driver);
    }







    @Override
    public String addVertex(Vertex vertex) {

        return  neo4jCYDAO.addVertex(vertex);
    }

    @Override
    public String changeVertex(Vertex vertex) {

        return neo4jCYDAO.changeVertex(vertex);
    }

    @Override
    public String deleteVertex(Vertex vertex) {
        return neo4jCYDAO.deleteVertex(vertex);
    }

    @Override
    public String addEdges(Edge edge) {
        return neo4jCYDAO.addEdges(edge);
    }

    @Override
    public String changeEdge(Edge edge) {
        return neo4jCYDAO.changeEdge(edge);
    }

    @Override
    public String deleteEdge(Edge edge) {
        return neo4jCYDAO.deleteEdge(edge);
    }

    @Override
    public JSONObject bfExtersion(Vertex vertex, int depth) {
        return neo4jCYDAO.bfExtersion(vertex,depth);
    }

    @Override
    public void dfExection(long fromId, long toId, int depth) {
        neo4jCYDAO.dfExection(fromId,toId,depth);

    }

    @Override
    public Vertex checkVertexByIdentity(String label, String identity) {
        return neo4jCYDAO.checkVertexByIdentity(label,identity);
    }


}
