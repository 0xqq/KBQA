package com.qdcz.graph.interfaces;

import com.qdcz.graph.entity.Edge;
import com.qdcz.graph.entity.IGraphEntity;
import com.qdcz.graph.entity.Vertex;
import org.json.JSONObject;

import java.util.List;
import java.util.Set;

/**
 * 图谱操作类接口
 * Created by star on 17-8-2.
 */
public interface IGraphDAO {

    /**
     * 添加点
     * @param vertex
     * @return
     */
    public String addVertex(Vertex vertex);


    /**
     * 修改点
     * @param vertex
     * @return
     */
    public String changeVertex(Vertex vertex);


    /**
     *删除点
     */
    public List<IGraphEntity> deleteVertex(Vertex vertex);


    /**
     * 新增边
     * @param edge
     * @return
     */
    public String addEdges(Edge edge);


    /**
     * 修改边
     * @param edge
     * @return
     */
    public String changeEdge(Edge edge);

    /**
     * 删除边
     * @param edge
     * @return
     */
    public String deleteEdge(Edge edge);

    /**
     * 根据节点查询广搜查询
     * @param vertex
     * @param depth
     * @return
     */
    public JSONObject bfExtersion(Vertex vertex,int depth);
    /**
     * 深度优先遍历
     * @param fromId
     * @param toId
     * @return
     */
    public void dfExection(long fromId,long toId,int depth);


    /**
     * 根据identity查询系统点信息
     * @param label
     * @param identity
     */
    public Vertex checkVertexByIdentity(String label,String  identity);

}
