package meteo.precipation;

import common.Classification;

/**
 Fog	0.005
 (0.013)	0.01	0.01
 (0.003)	6,264,000
 (67,425,000)
 Mist	.002
 (0.005)	.1	.7
 (.21)	2,510
 (27,000)
 Drizzle	.01
 (0.025)	.96	13.5
 (4.1)	14 (151)
 Light rain	.04
 (0.10)	1.24	15.7
 (4.8)	26
 (280)
 Moderate rain	.15
 (0.38)	1.60	18.7
 (5.7)	46
 (495)
 Heavy rain	.60
 (1.52)	2.05	22.0
 (6.7)	46
 (495)
 Excessive rain	1.60
 (4.06)	2.40	24.0
 (7.3)	76
 (818)
 Cloudburst	4.00
 (10.2)	2.85	25.9
 (7.9)
 */
public class FogClassification implements Classification
{
    @Override
    public boolean isClass(Object o) {
        //If you can get the droplets. Measure the droplets.
        //If you know the velocity classify using that.
        //intensity: cm/hour
        return false;
    }
}
