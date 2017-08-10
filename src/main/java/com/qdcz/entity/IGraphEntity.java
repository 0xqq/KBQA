package com.qdcz.entity;

import org.json.JSONObject;
import org.neo4j.driver.v1.types.Relationship;

/**
 * elasearch 需要的业务
 * Created by star on 17-8-2.
 */
public interface IGraphEntity  {
    public JSONObject toJSON();
    public String getGraphId();
    public String getGraphType();

    public JSONObject toQueryJSON();


    public int getEla_start();
    public int getEla_end();
}
