/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_explicit_vertex_parameter = "AMDShaderExplicitVertexParameter".nativeClassVK("AMD_shader_explicit_vertex_parameter", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li><a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/AMD/SPV_AMD_shader_explicit_vertex_parameter.html">SPV_AMD_shader_explicit_vertex_parameter</a></li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_shader_explicit_vertex_parameter}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>22</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Qun Lin, AMD @linqun</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-05-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Qun Lin, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Rex Xu, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME".."VK_AMD_shader_explicit_vertex_parameter"
    )
}