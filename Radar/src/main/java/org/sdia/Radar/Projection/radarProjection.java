package org.sdia.Radar.Projection;

import org.sdia.Radar.Entities.Radar;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullRadar",types =
        Radar.class)
public interface radarProjection {
}
