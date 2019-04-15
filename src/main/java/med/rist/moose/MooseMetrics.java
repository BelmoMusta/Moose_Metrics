package med.rist.moose;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.util.List;
import java.util.stream.Collectors;

public class MooseMetrics {

    public List<MetricsDescriber> getNOC(CompilationUnit compilationUnits) {
        return compilationUnits.findAll(ClassOrInterfaceDeclaration.class)
                .stream()
                .map(aClass ->
                        new MetricsDescriber(compilationUnits.getPackageDeclaration()
                                .map(pkg -> pkg.getName().asString() + ".")
                                .orElse("")
                                + aClass.getNameAsString(), aClass.getExtendedTypes().size()))
                .collect(Collectors.toList());

    }

}
