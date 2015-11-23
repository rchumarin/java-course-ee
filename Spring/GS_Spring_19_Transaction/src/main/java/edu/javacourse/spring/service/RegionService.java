package edu.javacourse.spring.service;

import edu.javacourse.spring.model.Region;

/**
 * Author: Georgy Gobozov
 * Date: 21.07.13
 */
public interface RegionService {

    public Region createRegion(Region region);

    public void deleteRegion(Region region);

    public Region getRegionByName(String name);

    public void readOnly(String name);
}
