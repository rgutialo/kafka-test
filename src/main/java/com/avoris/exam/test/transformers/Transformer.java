package com.avoris.exam.test.transformers;

/**
 * Transformer interface to transform a model and dto objects
 * @param <M> Incoming model class
 * @param <D> Outcoming dto class
 */
public interface Transformer<M, D> {

    /**
     * Transform a model objet into its dto
     * @param model Model object of M class
     * @return dto object
     */
    public D modelToDto(final M model);

    /**
     * Transform a dto objet into its model
     * @param dto Dto object of D class
     * @return model object
     */
    public M dtoToModel(final D dto);
}
