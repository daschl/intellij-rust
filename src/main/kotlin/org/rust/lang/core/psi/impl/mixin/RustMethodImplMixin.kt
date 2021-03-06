package org.rust.lang.core.psi.impl.mixin

import com.intellij.lang.ASTNode
import org.rust.lang.core.psi.RustDeclaringElement
import org.rust.lang.core.psi.RustMethod
import org.rust.lang.core.psi.impl.RustNamedElementImpl

abstract class RustMethodImplMixin(node: ASTNode)   : RustNamedElementImpl(node)
                                                    , RustMethod {

    override fun getDeclarations(): Collection<RustDeclaringElement> =
        anonParams?.anonParamList.orEmpty().filterNotNull()

}