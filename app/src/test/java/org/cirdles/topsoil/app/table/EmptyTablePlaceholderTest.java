/*
 * Copyright 2016 CIRDLES.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cirdles.topsoil.app.table;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

/**
 *
 * @author John Zeringue
 */
public class EmptyTablePlaceholderTest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new EmptyTablePlaceholder(null));
        stage.setScene(scene);
        stage.show();
    }

    @Test
    public void testLoadsFXML() {

    }

}
