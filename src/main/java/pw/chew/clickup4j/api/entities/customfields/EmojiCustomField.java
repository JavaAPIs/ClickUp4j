/*
 * Copyright 2022 Chew and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pw.chew.clickup4j.api.entities.customfields;

public interface EmojiCustomField extends ICustomField {
    @Override
    Integer getValue();

    /**
     * The emoji value associated with this custom field. E.g. \uD83D\uDE0E
     *
     * @return a string value of the unicode representation of the emoji
     */
    String getEmoji();

    /**
     * Gets the count for the rating used for this Emoji. Must be between 1-5.
     *
     * @return an int value of 1-5
     */
    int getCount();

    @Override
    default CustomFieldType getType() {
        return CustomFieldType.EMOJI;
    }
}
