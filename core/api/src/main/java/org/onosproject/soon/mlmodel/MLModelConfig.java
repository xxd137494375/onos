package org.onosproject.soon.mlmodel;


/**
 * 所有机器学习模型的父类
 */
public class MLModelConfig {
    public final MLAlgorithmType type;


    public MLModelConfig(MLAlgorithmType type) {
        this.type = type;
    }
}
