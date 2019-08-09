/*
 * Copyright (C) 2018, IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ibm.jnvmf;

import java.io.IOException;

public class AdminIdentifyActiveNamespaceIdsCommand extends
    AdminCommand<AdminIdentifyActiveNamespacesCommandCapsule, AdminResponseCapsule> {

  AdminIdentifyActiveNamespaceIdsCommand(AdminQueuePair queuePair) throws IOException {
    super(queuePair,
        new AdminIdentifyActiveNamespacesCommandCapsule(queuePair.allocateCommandCapsule()));
  }

  @Override
  public Response<AdminResponseCapsule> newResponse() {
    return new Response<>(new AdminResponseCapsule());
  }
}
