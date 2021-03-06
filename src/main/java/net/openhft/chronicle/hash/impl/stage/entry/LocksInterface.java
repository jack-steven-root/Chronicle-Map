/*
 * Copyright 2012-2018 Chronicle Map Contributors
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
 */

package net.openhft.chronicle.hash.impl.stage.entry;

public interface LocksInterface {

    boolean segmentHeaderInit();

    long segmentHeaderAddress();

    boolean locksInit();

    LocksInterface rootContextLockedOnThisSegment();

    void setNestedContextsLockedOnSameSegment(boolean nestedContextsLockedOnSameSegment);

    int latestSameThreadSegmentModCount();

    int changeAndGetLatestSameThreadSegmentModCount(int change);

    int totalReadLockCount();

    int changeAndGetTotalReadLockCount(int change);

    int totalUpdateLockCount();

    int changeAndGetTotalUpdateLockCount(int change);

    int totalWriteLockCount();

    int changeAndGetTotalWriteLockCount(int change);

    LocksInterface nextNode();

    void setNextNode(LocksInterface nextNode);

    String debugLocksState();
}
