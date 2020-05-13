package SourceCode;

import SourceCode.interfaces.UnionInterface;
import SourceCode.models.InMemoryUnion;

public class UnionFactory {
    public static UnionInterface unionObject = new InMemoryUnion();

    //factory method to generate InMemoryUnion Object
    public static UnionInterface getUnionObject(){
        return unionObject;
    }
    

}