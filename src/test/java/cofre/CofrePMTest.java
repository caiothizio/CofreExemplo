package cofre;

import static org.mockito.Mockito.mock;

/**
 *
 * @author andreendo
 */
public class CofrePMTest {
    SensorPorta sensorMock = mock(SensorPorta.class);
    Memoria memoriaMock = mock(Memoria.class);;
    CofrePM cofrePM = new CofrePM(sensorMock, memoriaMock);
}
